/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utn.cliente.model.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Steve
 */
@Entity
@Table(name = "cliente1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente1.findAll", query = "SELECT c FROM Cliente1 c")
    , @NamedQuery(name = "Cliente1.findByIdCliente", query = "SELECT c FROM Cliente1 c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente1.findByCedula", query = "SELECT c FROM Cliente1 c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Cliente1.findByNombre", query = "SELECT c FROM Cliente1 c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cliente1.findByApellido", query = "SELECT c FROM Cliente1 c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Cliente1.findByTelefono", query = "SELECT c FROM Cliente1 c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Cliente1.findByCorreo", query = "SELECT c FROM Cliente1 c WHERE c.correo = :correo")})
public class Cliente1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "cedula")
    private BigInteger cedula;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private BigInteger telefono;
    @Size(max = 30)
    @Column(name = "correo")
    private String correo;

    public Cliente1() {
    }

    public Cliente1(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public BigInteger getCedula() {
        return cedula;
    }

    public void setCedula(BigInteger cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente1)) {
            return false;
        }
        Cliente1 other = (Cliente1) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.utn.cliente.entities.Cliente1[ idCliente=" + idCliente + " ]";
    }
    
}
