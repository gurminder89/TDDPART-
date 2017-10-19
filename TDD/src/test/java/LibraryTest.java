import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;
public class LibraryTest {

	//@Before
	public void setUp() throws Exception {
	}

	//@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldRegisterMembers() {
		// given
        Library library = new Library();
        
     // when
        Member newMember = library.registerMember("lucky");
        Member newMember2 = library.registerMember("Bob");
        
     // then
        assertThat(newMember.getName(), is(equalTo("lucky")));
        assertThat(newMember2.getName(), is(equalTo("Bob")));
	}

}
