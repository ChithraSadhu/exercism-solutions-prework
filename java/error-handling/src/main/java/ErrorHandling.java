import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() throws Exception {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws Exception {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws Exception {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer){
        try {
            return Optional.of(Integer.parseInt(integer));
        }catch (Exception e){
            return Optional.empty();
        }
    }

}