package org.ipn.sistemaventas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.ipn.sistemaventas.model.ClienteDTO;
import org.ipn.sistemaventas.service.ClienteService;
import org.ipn.sistemaventas.service.impl.ClienteServiceImpl;


@ManagedBean
@RequestScoped
public class ClienteController {
    
    private ClienteDTO clienteDTO;
    
    private ClienteService clienteService;
    
    
    public ClienteController(){
        clienteDTO = new ClienteDTO();
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }
   

    
    
    public void guarCliente(){
       
        clienteService = new ClienteServiceImpl();
        clienteService.crearNuevoCliente(clienteDTO);
     
        System.out.println("========== Guardando cliente ======== ");
        System.out.println(clienteDTO);
    }
    
    
    
    
    
    
}
