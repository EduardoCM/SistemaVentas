package org.ipn.sistemaventas.dao;

import org.ipn.sistemaventas.model.ClienteDTO;

public interface ClienteDAO {
    
    public void crearNuevoCliente(ClienteDTO clienteDTO);
    
    public void listasClientes();
    
    public ClienteDTO buscarClientePorCodigo(int codigo);
    
    public void actualizarCliente(ClienteDTO clienteDTO);
    
    public void borrarCliente(ClienteDTO clienteDTO);
    
    public boolean buscarEnBdFraudes(ClienteDTO clienteDTO);
    
    
    
}
