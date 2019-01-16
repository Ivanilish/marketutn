/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utn.cliente.model;

import ec.edu.utn.cliente.model.entities.Cliente1;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Steve
 */
@Stateless
public class crudCliente implements Serializable{

    @PersistenceContext(unitName = "clienteDS")
    private EntityManager cl;



    public List<Cliente1> getAllClient() {
        List<Cliente1> listado = cl.createQuery("SELECT c FROM Cliente1 c").getResultList();
        return listado;
    }

    public boolean clientIncome(Cliente1 cli) throws Exception {

        if (cli != null) {
            cl.getTransaction().begin();

            try {
                cl.persist(cli);
                cl.getTransaction().commit();
                return true;
            } catch (Exception e) {
                cl.getTransaction().rollback();
                return false;
            }
        } else {
            throw new Exception("Error no se pudo ingresar el cliente");
        }

    }

    public boolean deleteClient(String id_cliente) throws Exception {
        Cliente1 cli = (Cliente1) cl.find(Cliente1.class, id_cliente);
        if (cli != null) {
            cl.remove(cli);
            return true;
        } else {
            throw new Exception("Erros en la busqueda del cliente");
        }

    }

    public boolean updateClient(String id_cliente, int cedula) throws Exception {
        Cliente1 cli = (Cliente1) cl.find(Cliente1.class, id_cliente);
        if (cli != null) {
           cli.setCedula(BigInteger.valueOf(cedula));
           cl.merge(cli);
           return true;
        } else {
            throw new Exception("Erros en la busqueda del cliente");
        }

    }

    public Cliente1 getClient(int cedulaconsulta) throws Exception {
       
        Cliente1 cli = (Cliente1) cl.find(Cliente1.class, cedulaconsulta);
        if (cli != null) {
            return cli;
        } else {
            throw new Exception("Erros en la busqueda del cliente");
        }
    }

}
