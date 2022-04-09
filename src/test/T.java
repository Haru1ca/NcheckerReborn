import dev.Nchecker.Utils.EncryptUtils;

/**
 * package PACKAGE_NAME
 * project NcheckerReborn
 * Created by @author XBigRiceH on date 2022/02/10
 */
public class T {
    public static void main(String[] args) {
        System.out.println(EncryptUtils.encrypt("123"));
        System.out.println(EncryptUtils.decrypt(EncryptUtils.encrypt("123")));
    }
}
