package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyListItemsSpecEgressToIpBlock {
    private String cidr;
    private List<String> except;

    public NetworkPolicyListItemsSpecEgressToIpBlock() {
        // no-op
    }

    public NetworkPolicyListItemsSpecEgressToIpBlock(final String cidr,
                                                     final List<String> except) {
        // no-op
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(final String cidr) {
        this.cidr = cidr;
    }

    public List<String> getExcept() {
        return except;
    }

    public void setExcept(final List<String> except) {
        this.except = except;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cidr,
                except);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyListItemsSpecEgressToIpBlock)) {
            return false;
        }
        final NetworkPolicyListItemsSpecEgressToIpBlock __otherCasted = (NetworkPolicyListItemsSpecEgressToIpBlock) __other;
        return Objects.equals(cidr, __otherCasted.cidr) &&
            Objects.equals(except, __otherCasted.except);
    }
}
