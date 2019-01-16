/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utn.cliente.view;


import ec.edu.utn.cliente.model.crudCliente;
import ec.edu.utn.cliente.model.entities.Cliente1;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;

@ManagedBean
@SessionScoped
public class ControllerCli implements Serializable{
    
    private String cedula;
    private String cedulaconsulta;
    private List<Cliente1> listado;
   
    
    private 
    @EJB
    crudCliente manager;
    
    public void consultarEmpleado(){
        try {
           Cliente1 emp = manager.getClient(Integer.parseInt(cedulaconsulta));
           if(emp!=null){
               String respuesta = "Cedula: "+emp.getCedula().toString();
            System.out.println(respuesta);
            RequestContext.getCurrentInstance().execute("swal(\"Exelecete!\", \""+respuesta+"\", \"success\");");
           }else{}
            
        } catch (Exception ex) {
            RequestContext.getCurrentInstance().execute("swal(\"Hoo No!\", \""+ex.getMessage()+"\", \"error\");");
        }
        
    }
    
    public String actionListarEmpelados()
    {
        listado = manager.getAllClient();
        return "index";
    }
    

    
    

    public List<Cliente1> getListado() {
        return listado;
    }

    public void setListado(List<Cliente1> listado) {
        this.listado = listado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedulaconsulta() {
        return cedulaconsulta;
    }

    public void setCedulaconsulta(String cedulaconsulta) {
        this.cedulaconsulta = cedulaconsulta;
    }

  
   
    


 
    
}
