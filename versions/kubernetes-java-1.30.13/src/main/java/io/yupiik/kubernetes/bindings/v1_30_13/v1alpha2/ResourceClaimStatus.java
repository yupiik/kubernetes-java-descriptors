package io.yupiik.kubernetes.bindings.v1_30_13.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_13.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimStatus implements Validable<ResourceClaimStatus>, Exportable {
    private AllocationResult allocation;
    private Boolean deallocationRequested;
    private String driverName;
    private List<ResourceClaimConsumerReference> reservedFor;

    public ResourceClaimStatus() {
        // no-op
    }

    public ResourceClaimStatus(final AllocationResult allocation,
                               final Boolean deallocationRequested,
                               final String driverName,
                               final List<ResourceClaimConsumerReference> reservedFor) {
        this.allocation = allocation;
        this.deallocationRequested = deallocationRequested;
        this.driverName = driverName;
        this.reservedFor = reservedFor;
    }

    public AllocationResult getAllocation() {
        return allocation;
    }

    public void setAllocation(final AllocationResult allocation) {
        this.allocation = allocation;
    }

    public Boolean getDeallocationRequested() {
        return deallocationRequested;
    }

    public void setDeallocationRequested(final Boolean deallocationRequested) {
        this.deallocationRequested = deallocationRequested;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    public List<ResourceClaimConsumerReference> getReservedFor() {
        return reservedFor;
    }

    public void setReservedFor(final List<ResourceClaimConsumerReference> reservedFor) {
        this.reservedFor = reservedFor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocation,
                deallocationRequested,
                driverName,
                reservedFor);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimStatus)) {
            return false;
        }
        final ResourceClaimStatus __otherCasted = (ResourceClaimStatus) __other;
        return Objects.equals(allocation, __otherCasted.allocation) &&
            Objects.equals(deallocationRequested, __otherCasted.deallocationRequested) &&
            Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(reservedFor, __otherCasted.reservedFor);
    }

    public ResourceClaimStatus allocation(final AllocationResult allocation) {
        this.allocation = allocation;
        return this;
    }

    public ResourceClaimStatus deallocationRequested(final Boolean deallocationRequested) {
        this.deallocationRequested = deallocationRequested;
        return this;
    }

    public ResourceClaimStatus driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public ResourceClaimStatus reservedFor(final List<ResourceClaimConsumerReference> reservedFor) {
        this.reservedFor = reservedFor;
        return this;
    }

    @Override
    public ResourceClaimStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allocation != null ? "\"allocation\":" + allocation.asJson() : ""),
                    (deallocationRequested != null ? "\"deallocationRequested\":" + deallocationRequested : ""),
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (reservedFor != null ? "\"reservedFor\":" + reservedFor.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
