public class CheckControl implements Checkerable {
    private static String dataUser = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";
    public boolean check(String q){
    char [] chars = q.toCharArray();
        for (char symbol: chars) {
            if (!dataUser.contains(Character.toString(symbol))) {
                return false;
            }
        }
        return true;
        }


    }


