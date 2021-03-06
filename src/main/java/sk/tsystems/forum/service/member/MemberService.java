package sk.tsystems.forum.service.member;

import sk.tsystems.forum.entity.Member;

import java.util.List;

public interface MemberService {

    void register(Member member);

    Member login (String username, String password);

    Member getMember (long id);

    void deleteMember(long id);

    List getMembers();

    boolean emailExists(String email);

    boolean usernameExists(String username);
}
