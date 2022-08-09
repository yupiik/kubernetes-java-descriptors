package io.yupiik.kubernetes.bindings.v1_19_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_0.Validable;
import io.yupiik.kubernetes.bindings.v1_19_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LeaseSpec implements Validable<LeaseSpec>, Exportable {
    private String acquireTime;
    private String holderIdentity;
    private Integer leaseDurationSeconds;
    private Integer leaseTransitions;
    private String renewTime;

    public LeaseSpec() {
        // no-op
    }

    public LeaseSpec(final String acquireTime,
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
        if (!(__other instanceof LeaseSpec)) {
            return false;
        }
        final LeaseSpec __otherCasted = (LeaseSpec) __other;
        return Objects.equals(acquireTime, __otherCasted.acquireTime) &&
            Objects.equals(holderIdentity, __otherCasted.holderIdentity) &&
            Objects.equals(leaseDurationSeconds, __otherCasted.leaseDurationSeconds) &&
            Objects.equals(leaseTransitions, __otherCasted.leaseTransitions) &&
            Objects.equals(renewTime, __otherCasted.renewTime);
    }

    public LeaseSpec acquireTime(final String acquireTime) {
        this.acquireTime = acquireTime;
        return this;
    }

    public LeaseSpec holderIdentity(final String holderIdentity) {
        this.holderIdentity = holderIdentity;
        return this;
    }

    public LeaseSpec leaseDurationSeconds(final Integer leaseDurationSeconds) {
        this.leaseDurationSeconds = leaseDurationSeconds;
        return this;
    }

    public LeaseSpec leaseTransitions(final Integer leaseTransitions) {
        this.leaseTransitions = leaseTransitions;
        return this;
    }

    public LeaseSpec renewTime(final String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    @Override
    public LeaseSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (acquireTime != null ? "\"acquireTime\":\"" +  JsonStrings.escapeJson(acquireTime) + "\"" : ""),
                    (holderIdentity != null ? "\"holderIdentity\":\"" +  JsonStrings.escapeJson(holderIdentity) + "\"" : ""),
                    (leaseDurationSeconds != null ? "\"leaseDurationSeconds\":" + leaseDurationSeconds : ""),
                    (leaseTransitions != null ? "\"leaseTransitions\":" + leaseTransitions : ""),
                    (renewTime != null ? "\"renewTime\":\"" +  JsonStrings.escapeJson(renewTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
