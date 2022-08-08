package io.yupiik.kubernetes.bindings.v1_16_12;

import java.util.Objects;

public class LeaseListItemsSpec {
    private String acquireTime;
    private String holderIdentity;
    private Integer leaseDurationSeconds;
    private Integer leaseTransitions;
    private String renewTime;

    public LeaseListItemsSpec() {
        // no-op
    }

    public LeaseListItemsSpec(final String acquireTime,
                              final String holderIdentity,
                              final Integer leaseDurationSeconds,
                              final Integer leaseTransitions,
                              final String renewTime) {
        // no-op
    }

    public String getAcquireTime() {
        return acquireTime;
    }

    public void setAcquireTime(final String acquireTime) {
        this.acquireTime = acquireTime;
    }

    public String getHolderIdentity() {
        return holderIdentity;
    }

    public void setHolderIdentity(final String holderIdentity) {
        this.holderIdentity = holderIdentity;
    }

    public Integer getLeaseDurationSeconds() {
        return leaseDurationSeconds;
    }

    public void setLeaseDurationSeconds(final Integer leaseDurationSeconds) {
        this.leaseDurationSeconds = leaseDurationSeconds;
    }

    public Integer getLeaseTransitions() {
        return leaseTransitions;
    }

    public void setLeaseTransitions(final Integer leaseTransitions) {
        this.leaseTransitions = leaseTransitions;
    }

    public String getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(final String renewTime) {
        this.renewTime = renewTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acquireTime,
                holderIdentity,
                leaseDurationSeconds,
                leaseTransitions,
                renewTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LeaseListItemsSpec)) {
            return false;
        }
        final LeaseListItemsSpec __otherCasted = (LeaseListItemsSpec) __other;
        return Objects.equals(acquireTime, __otherCasted.acquireTime) &&
            Objects.equals(holderIdentity, __otherCasted.holderIdentity) &&
            Objects.equals(leaseDurationSeconds, __otherCasted.leaseDurationSeconds) &&
            Objects.equals(leaseTransitions, __otherCasted.leaseTransitions) &&
            Objects.equals(renewTime, __otherCasted.renewTime);
    }
}
