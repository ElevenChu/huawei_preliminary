
import com.wtnl.pojo.VM;
/**
 * 信息请求序列
 */
public class InfoRequest {

    private String deal;//要进行的操作add或者是del
    private String VmType;//虚拟机的型号
    private int VmId;//虚拟机ID

    public InfoRequest() {
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public String getVmType() {
        return VmType;
    }

    public void setVmType(String vmType) {
        VmType = vmType;
    }

    public int getVmId() {
        return VmId;
    }

    public void setVmId(int vmId) {
        VmId = vmId;
    }

    public InfoRequest(String deal, int vmId) {
        this.deal = deal;
        VmId = vmId;
    }

    public InfoRequest(String deal, String vmType, int vmId) {
        this.deal = deal;
        VmType = vmType;
        VmId = vmId;

    }

    @Override
    public String toString() {
        return "InfoRequest{" +
                "deal='" + deal + '\'' +
                ", VmType='" + VmType + '\'' +
                ", VmId=" + VmId +
                '}';
    }
}
