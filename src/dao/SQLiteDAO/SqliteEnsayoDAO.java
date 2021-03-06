/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.EnsayoDAO;
import dao.Factory.SqliteDAOFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Ensayo;

/**
 *
 * @author Daniel Rocha
 */
public class SqliteEnsayoDAO implements EnsayoDAO {

    Connection db = SqliteDAOFactory.createConnection();

    public static void main(String[] args) {
        SqliteEnsayoDAO en = new SqliteEnsayoDAO();
        // en.insertEnsayo(new Ensayo("2", "P1", "M1", "20/10/2014", "ENSAYO2", "posi", 5, "gelo", "20/10/2014"));
        //en.updateEnsayo(new Ensayo("2", "P1", "1", "20/10/2013", "modif", "negative", 10, "notgelo", "20/10/2014"));
        //en.deleteEnsayo("2", "M1", "P1");
        //System.out.println(en.findEnsayo("P1", "1", "1"));
        for (Ensayo e : en.getAllEnsayos("P1", "M1")) {
            System.out.println(e);
        }
    }

    @Override
    public Ensayo findEnsayo(String idPaciente, String idMuestra, String idEnsayo) {
        Ensayo ensayo = null;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "SELECT * "
                    + "FROM ensayo "
                    + "WHERE id_Paciente = " + "'" + idPaciente + "' "
                    + " and id_muestra = " + "'" + idMuestra + "' "
                    + " and id_ensayo = " + "'" + idEnsayo + "'; ";

            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            if (rs.next()) {
                ensayo = new Ensayo();
                ensayo.setIdEnsayo(rs.getString("id_ensayo"));
                ensayo.setIdPaciente(rs.getString("id_Paciente"));
                ensayo.setIdMuestra(rs.getString("id_muestra"));;
                ensayo.setFechaExtraccion(rs.getString("extraccion_fecha"));
                ensayo.setTipoExtraccion(rs.getString("extraccion_tipo"));
                ensayo.setResultado(rs.getString("resultado"));
                ensayo.setNumeroExtraccion(rs.getInt("numero_extraccion"));
                ensayo.setTipoGel(rs.getString("gel_tipo"));
                ensayo.setFechaGel(rs.getString("gel_fecha"));
            }
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return ensayo;
    }

    @Override
    public boolean insertEnsayo(Ensayo ensayo) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "INSERT INTO ensayo VALUES('" + ensayo.getIdEnsayo() + "', '"
                    + ensayo.getIdMuestra() + "', '" + ensayo.getIdPaciente() + "', '"
                    + ensayo.getFechaExtraccion() + "', '" + ensayo.getTipoExtraccion() + "','"
                    + ensayo.getResultado() + "', " + ensayo.getNumeroExtraccion() + ", '"
                    + ensayo.getTipoGel() + "', '" + ensayo.getFechaGel() + "');";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return res;
    }

    @Override
    public boolean deleteEnsayo(String idEnsayo, String idMuestra, String idPaciente) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "DELETE FROM ensayo WHERE id_ensayo ='" + idEnsayo + "' AND "
                    + "id_muestra = '" + idMuestra + "' AND " + "id_Paciente = '" + idPaciente + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return res;
    }

    @Override
    public boolean updateEnsayo(Ensayo ensayo) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "UPDATE ensayo SET extraccion_fecha ='" + ensayo.getFechaExtraccion()
                    + "', extraccion_tipo='" + ensayo.getTipoExtraccion() + "', "
                    + "resultado ='" + ensayo.getResultado() + "', numero_extraccion ="
                    + ensayo.getNumeroExtraccion() + ", gel_tipo ='" + ensayo.getTipoGel()
                    + "', gel_fecha ='" + ensayo.getFechaGel() + "' "
                    + "WHERE id_ensayo ='" + ensayo.getIdEnsayo() + "' AND "
                    + "id_muestra = '" + ensayo.getIdMuestra() + "' AND "
                    + "id_Paciente = '" + ensayo.getIdPaciente() + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return res;
    }

    @Override
    public List<Ensayo> getAllEnsayos(String idPaciente, String idMuestra) {
        List<Ensayo> ensayos = new ArrayList<Ensayo>();
        Ensayo ensayo = new Ensayo();

        //Recorre todos los ensayos posibles para una muestra y los agrega si es que existan
        for (int i = 1; i <= 5; i++) {
            ensayo = findEnsayo(idPaciente, idMuestra, Integer.toString(i));
            if (ensayo != null) {
                ensayos.add(ensayo);
            }
        }
        return ensayos;
    }
}
