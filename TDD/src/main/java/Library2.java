
 
import java.util.ArrayList;
import java.util.Collection;
 
public class Library2 {
 
    private final Collection<Member2> members = new ArrayList<Member2>();
 
    /**
     * Registers a new member using provided name.
     * 
     * @param name
     *            The name of the member
     * @return registered member
     */
    public Member2 registerMember(String name) {
 
        Member2 newMember = new Member2(name);
 
        if (!members.contains(newMember)) {
            throw new AlreadyMemberException();
        }
 
        members.add(newMember);
        return newMember;
    }
 
}
