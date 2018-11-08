package selfproject.ffboard.exception;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DaoException")
public class DaoException implements FFException{
    @Override
    public void printLong(String message) {
        //로그남기기
    }
}
