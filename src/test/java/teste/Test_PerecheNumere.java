package teste;

import ex.PerecheNumere;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_PerecheNumere {

        @Test
        public void testSuntConsecutiveInFibonacci() {
            PerecheNumere pereche1 = new PerecheNumere(1, 2);
            assertTrue(pereche1.suntConsecutiveInFibonacci());

            PerecheNumere pereche2 = new PerecheNumere(3, 5);
            assertTrue(pereche2.suntConsecutiveInFibonacci());

            PerecheNumere pereche3 = new PerecheNumere(4, 7);
            assertFalse(pereche3.suntConsecutiveInFibonacci());
        }

        @Test
        public void testCelMicMultipluComun() {
            PerecheNumere pereche1 = new PerecheNumere(4, 6);
            assertEquals(12, pereche1.celMicMultipluComun());

            PerecheNumere pereche2 = new PerecheNumere(8, 12);
            assertEquals(24, pereche2.celMicMultipluComun());

            PerecheNumere pereche3 = new PerecheNumere(5, 7);
            assertEquals(35, pereche3.celMicMultipluComun());
        }

        @Test
        public void testAuSumaCifrelorEgala() {
            PerecheNumere pereche1 = new PerecheNumere(123, 51);
            assertTrue(pereche1.auSumaCifrelorEgala());

            PerecheNumere pereche2 = new PerecheNumere(456, 654);
            assertTrue(pereche2.auSumaCifrelorEgala());

            PerecheNumere pereche3 = new PerecheNumere(123, 789);
            assertFalse(pereche3.auSumaCifrelorEgala());
        }

        @Test
        public void testAuAcelasiNumarCifrePare() {
            PerecheNumere pereche1 = new PerecheNumere(246, 468);
            assertTrue(pereche1.auAcelasiNumarCifrePare());

            PerecheNumere pereche2 = new PerecheNumere(13579, 8642);
            assertFalse(pereche2.auAcelasiNumarCifrePare());

            PerecheNumere pereche3 = new PerecheNumere(2555, 23);
            assertTrue(pereche3.auAcelasiNumarCifrePare());
        }
    }


