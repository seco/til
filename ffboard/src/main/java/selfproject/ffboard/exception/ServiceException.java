package selfproject.ffboard.exception;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ServiceException")
public class ServiceException implements FFException {
    @Override
    public void printLong(String message) {
        //로그.남기기
    }
}
