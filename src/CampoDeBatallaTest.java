import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CampoDeBatallaTest {
    CampoDeBatalla campoDeBatalla1=new CampoDeBatalla("");
    CampoDeBatalla campoDeBatalla2=new CampoDeBatalla("asdads[asd]asd");
    CampoDeBatalla campoDeBatalla3=new CampoDeBatalla("asdad##s[asd]asd");
    CampoDeBatalla campoDeBatalla4=new CampoDeBatalla("asdad#s[asd]asd");
    CampoDeBatalla campoDeBatalla5=new CampoDeBatalla("asdads[asd]as#d");
    CampoDeBatalla campoDeBatalla6=new CampoDeBatalla("asdadsasdas#d");
    @Before
    public void executedBeforeEach() {

    }
    @Test
    public void whenIsEmptyAllAreAlive(){
        assertEquals(campoDeBatalla1.checkCampoDeBatalla(),"");
    }
    @Test
    public void whenThereIsNotASharp(){
        assertEquals(campoDeBatalla2.checkCampoDeBatalla(),campoDeBatalla2.getPeople());
    }
    @Test
    public void whenThereIsMoreOrEqualsThanTwoSharp(){
        assertEquals(campoDeBatalla3.checkCampoDeBatalla(),"");
    }
    @Test
    public void whenThereIsABomb(){
        assertEquals(campoDeBatalla4.checkCampoDeBatalla(),"asd");
        assertEquals(campoDeBatalla5.checkCampoDeBatalla(),"asd");
    }
    @Test
    public void whenThereIsABombButNotCamp(){
        assertEquals(campoDeBatalla6.checkCampoDeBatalla(),"");

    }



}
