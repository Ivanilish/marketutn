package ec.edu.utn.cliente.model.entities;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-15T18:39:48")
@StaticMetamodel(Cliente1.class)
public class Cliente1_ { 

    public static volatile SingularAttribute<Cliente1, Integer> idCliente;
    public static volatile SingularAttribute<Cliente1, BigInteger> cedula;
    public static volatile SingularAttribute<Cliente1, String> apellido;
    public static volatile SingularAttribute<Cliente1, String> correo;
    public static volatile SingularAttribute<Cliente1, BigInteger> telefono;
    public static volatile SingularAttribute<Cliente1, String> nombre;

}