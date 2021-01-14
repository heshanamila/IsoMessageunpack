import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.packager.GenericValidatingPackager;

public class isomessage {
    public static void main(String[] args) throws ISOException {
        String message = "02003020058020C002040000000000000100000000090052007100335413330002001031D2512201014590756034303130303030303030303030313030303030333030300141820258008407A0000000041010950502000080009A032012149C01005F2A0201449F02060000000100009F03060000000000009F090200029F10080101A0000020DAC09F1A0201449F1E0831303130323339379F2608675CD6A91DC7298A9F2701809F3303E0B0C89F34031E00009F3501229F360200019F3704196708649F4104000000029F5301525F3401000006303030303037";

        ISOMsg im = new ISOMsg();

        GenericValidatingPackager packager = new GenericValidatingPackager();
        packager.readFile("D:\\isomessageweb\\src\\main\\java\\iso87binary.xml");

        im.setPackager(packager);
        im.unpack(ISOUtil.hex2byte(message));
        System.out.printf("MTI = %s%n", im.getMTI());
        for (int i = 1; i <= im.getMaxField(); i++) {
            if (im.hasField(i)) {
                System.out.printf("Field (%s) = %s%n", i,im.getString(i));
            }
        }
    }

}