package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LeaseSpec implements Validable<LeaseSpec>, Exportable {
    private String acquireTime;
    private String holderIdentity;
    private Integer leaseDurationSeconds;
    private Integer leaseTransitions;
    private String preferredHolder;
    private String renewTime;
    private String strategy;

    public LeaseSpec() {
        // no-op
    }

    public LeaseSpec(final String acquireTime,
                     final String holderIdentity,
                     final Integer leaseDurationSeconds,
                     final Integer leaseTransitions,
                     final String preferredHolder,
                     final String renewTime,
                     final String strategy) {
        this.acquireTime = acquireTime;
        this.holderIdentity = holderIdentity;
        this.leaseDurationSeconds = leaseDurationSeconds;
        this.leaseTransitions = leaseTransitions;
        this.preferredHolder = preferredHolder;
        this.renewTime = renewTime;
        this.strategy = strategy;
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

    public String getPreferredHolder() {
        return preferredHolder;
    }

    public void setPreferredHolder(final String preferredHolder) {
        this.preferredHolder = preferredHolder;
    }

    public String getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(final String renewTime) {
        this.renewTime = renewTime;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acquireTime,
                holderIdentity,
                leaseDurationSeconds,
                leaseTransitions,
                preferredHolder,
                renewTime,
                strategy);
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
            Objects.equals(preferredHolder, __otherCasted.preferredHolder) &&
            Objects.equals(renewTime, __otherCasted.renewTime) &&
            Objects.equals(strategy, __otherCasted.strategy);
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

    public LeaseSpec preferredHolder(final String preferredHolder) {
        this.preferredHolder = preferredHolder;
        return this;
    }

    public LeaseSpec renewTime(final String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public LeaseSpec strategy(final String strategy) {
        this.strategy = strategy;
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
                    (preferredHolder != null ? "\"preferredHolder\":\"" +  JsonStrings.escapeJson(preferredHolder) + "\"" : ""),
                    (renewTime != null ? "\"renewTime\":\"" +  JsonStrings.escapeJson(renewTime) + "\"" : ""),
                    (strategy != null ? "\"strategy\":\"" +  JsonStrings.escapeJson(strategy) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
