package org.ipn.sistemaventas.dao.impl;

import java.sql.PreparedStatement;
import org.ipn.sistemaventas.dao.ClienteDAO;
import org.ipn.sistemaventas.dao.SistemaVentasConnection;
import org.ipn.sistemaventas.model.ClienteDTO;

public class ClienteDAOImpl extends SistemaVentasConnection implements ClienteDAO{

    @Override
    public void crearNuevoCliente(ClienteDTO clienteDTO) {
        System.out.println("ClienteDAOImpl " + clienteDTO);
        try {
            this.Conectar();
            String sqlInsert = "INSERT INTO CLIENTES "
                    + "(CODIGO, NOMBRE,APELLIDOS,PAIS,SEXO) VALUES (?, ?, ?, ?, ?) ";
            
            PreparedStatement st = this.getCon().prepareStatement(sqlInsert);
            
            st.setInt(1, clienteDTO.getCodigo());
            st.setString(2, clienteDTO.getNombre());
            st.setString(3, clienteDTO.getApellidos());
            st.setString(4, clienteDTO.getPais());
            st.setString(5, clienteDTO.getSexo());
            
            
            System.out.println("::: ANtes de ejecutar");
            int result = st.executeUpdate();
            System.out.println("::: Resultado: " + result);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        System.out.println(":::: Final");
    }

    @Override
    public void listasClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO buscarClientePorCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCliente(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarCliente(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscarEnBdFraudes(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
