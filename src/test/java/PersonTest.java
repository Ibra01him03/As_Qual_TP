import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Exercice 01 test :
public class PersonTest {

    @Test
    public void getFullNameTest(){
        //Arrange
        Person p = new Person("GHIS","Ibrahim",22);
        //Act
        String result = p.getFullName();
        //Assert
        Assertions.assertEquals("Ibrahim GHIS",result);
    }

    @Test
    public void isAdultTest(){
        //Arrange
        Person p = new Person("GHIS","Ibrahim",19);
        //Act
        Boolean result = p.isAdult();
        //Assert
        Assertions.assertEquals(true,result);
    }

    @Test
    public void isNotAdultTest(){
        //Arrange
        Person p = new Person("GHIS","Abdou",7);
        //Act
        Boolean result = p.isAdult();
        //Assert
        Assertions.assertEquals(false,result);
    }
}

