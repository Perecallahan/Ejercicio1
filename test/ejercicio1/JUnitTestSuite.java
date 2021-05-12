package ejercicio1;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *@author javier Bustamante Toledo
 * @author daniel reguera bazan
 */

@RunWith (value = Suite.class)
@Suite.SuiteClasses ( {
        Ejercicio1baseEquivalencias.class,
        Ejercicio1beforeAfter.class,
        Ejercicio1beforeAfterClass.class,
        Ejercicio1parametrizadas.class,
    }
)
public class JUnitTestSuite {
}
