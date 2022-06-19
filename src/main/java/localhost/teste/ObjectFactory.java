//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.06.19 às 12:17:23 AM GFT 
//


package localhost.teste;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost.teste package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost.teste
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetAllUsersRequest }
     * 
     */
    public GetAllUsersRequest createGetAllUsersRequest() {
        return new GetAllUsersRequest();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link GetAllMusicsRequest }
     * 
     */
    public GetAllMusicsRequest createGetAllMusicsRequest() {
        return new GetAllMusicsRequest();
    }

    /**
     * Create an instance of {@link GetAllMusicsResponse }
     * 
     */
    public GetAllMusicsResponse createGetAllMusicsResponse() {
        return new GetAllMusicsResponse();
    }

    /**
     * Create an instance of {@link Music }
     * 
     */
    public Music createMusic() {
        return new Music();
    }

}
