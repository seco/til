package selfproject.ffboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import selfproject.ffboard.dao.AdminDao;
import selfproject.ffboard.dao.MemberDao;
import selfproject.ffboard.dto.Member;
import selfproject.ffboard.exception.FFException;

import java.util.*;

@Service
public class MemberServiceImpl implements MemberSerivce {
    private MemberDao memberDao;
    private AdminDao adminDao;

    @Autowired
    @Qualifier(value = "DaoExeption")
    private FFException daoExeption;

    public MemberServiceImpl(MemberDao memberDao, FFException daoExeption, AdminDao adminDao) {
        this.daoExeption = daoExeption;
        this.memberDao = memberDao;
        this.adminDao = adminDao;
    }

    @Override
    @Transactional
    public Long signUp(Member member) {
        Long result = null;
        try{
            result = memberDao.signUp(member);
        } catch (DataAccessException dae) {
            daoExeption.printLong(dae.toString());
        }
        return result;
    }

    @Override
    @Transactional(readOnly = true)
    public Member login(Member member) {
        try{
            member = memberDao.login(member);
            Set set = new HashSet();
            for(String perm : adminDao.getMemPerm(member.getId())) {
                set.add(perm);
            }
            member.setPerms(set);
            return member;
        }catch (DataAccessException dae) {
            daoExeption.printLong(dae.toString());
            return null;
        }
    }

    @Override
    @Transactional
    public int logout(Member member) {
        return 0;
    }
}
