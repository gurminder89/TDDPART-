import org.junit.Test;

public class LibraryTest2 {
 
    @Test
    public void shouldRegisterMembers() { ... }
 
    @Test
    public void shouldNotRegisterAgainWhenAlreadyMember2() {
 
        // given
        Library2 library = new Library2();
        library.registerMember("Ted");
 
        // when we register with same name
        try {
            library.registerMember("Ted");
            fail("should not have registered Ted twice");
        } catch (AlreadyMemberException e) {
            // success!
        }
 
    }
}
