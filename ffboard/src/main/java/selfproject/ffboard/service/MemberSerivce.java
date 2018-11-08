package selfproject.ffboard.service;

import selfproject.ffboard.dto.Member;

public interface MemberSerivce {
    public Long signUp(Member member);
    public Member login(Member member);
    public int logout(Member member);
}
