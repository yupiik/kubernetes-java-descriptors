package io.yupiik.kubernetes.bindings.v1_16_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicySpecEgressToIpBlock {
    private String cidr;
    private List<String> except;

    public NetworkPolicySpecEgressToIpBlock() {
        // no-op
    }

    public NetworkPolicySpecEgressToIpBlock(final String cidr,
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
        if (!(__other instanceof NetworkPolicySpecEgressToIpBlock)) {
            return false;
        }
        final NetworkPolicySpecEgressToIpBlock __otherCasted = (NetworkPolicySpecEgressToIpBlock) __other;
        return Objects.equals(cidr, __otherCasted.cidr) &&
            Objects.equals(except, __otherCasted.except);
    }
}
