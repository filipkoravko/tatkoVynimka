public class ClassThatThrowsException {

    public boolean throwExceptionOrNot(boolean throwException) throws Exception {
        if (throwException) throw new Exception();
        return true;
    }

}
