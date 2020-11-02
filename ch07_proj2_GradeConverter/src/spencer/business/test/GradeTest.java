package spencer.business.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import spencer.business.Grade;

class GradeTest {

	@Test
	void testLetterGradeF() {
		Grade gradeF = new Grade(50);

		assertEquals("F", gradeF.getLetter());
				
	}

}
