package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.Person;
import logic.pesCov;

class SubscribeTest {

	@Test
	void test() {
		String n = "mario";
		String sn = "rossi";
		String add = "via catullo 11";
		String nC = "0123456789";
		pesCov pc = new pesCov();
		Person a = pc.setPersonAndReturnUsername(n, sn, add, nC);
		byte[] actRes = a.getName().getBytes();
		byte[] exRes = n.getBytes();
		assertEquals(exRes, actRes);
	}

}
