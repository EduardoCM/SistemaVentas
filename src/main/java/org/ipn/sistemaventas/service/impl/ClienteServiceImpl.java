package org.ipn.sistemaventas.service.impl;

import org.ipn.sistemaventas.dao.ClienteDAO;
import org.ipn.sistemaventas.dao.impl.ClienteDAOImpl;
import org.ipn.sistemaventas.model.ClienteDTO;
import org.ipn.sistemaventas.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

    private ClienteDAO clienteDao;
    
    @Override
    public void crearNuevoCliente(ClienteDTO clienteDTO) {
        clienteDao = new ClienteDAOImpl();
        System.out.println(":::: Guardando datos en Cliente Service " + clienteDTO);
        clienteDao.crearNuevoCliente(clienteDTO);
   
    }

    @Override
    public void listasClientes() {
         clienteDao = new ClienteDAOImpl();    
         clienteDao.listasClientes();
    }

    @Override
    public ClienteDTO buscarClientePorCodigo(int codigo) {
        clienteDao = new ClienteDAOImpl();
        return clienteDao.buscarClientePorCodigo(codigo);
    }

    @Override
    public void actualizarCliente(ClienteDTO clienteDTO) {
        clienteDao = new ClienteDAOImpl();
        clienteDao.actualizarCliente(clienteDTO);
    }

    @Override
    public void borrarCliente(ClienteDTO clienteDTO) {
        clienteDao = new ClienteDAOImpl();
       clienteDao.borrarCliente(clienteDTO);
    }

    @Override
    public boolean buscarEnBdFraudes(ClienteDTO clienteDTO) {
        clienteDao = new ClienteDAOImpl();
      return false;
    }
    
    
    
}
