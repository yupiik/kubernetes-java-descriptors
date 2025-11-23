package io.yupiik.kubernetes.bindings.v1_33_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceCIDRStatus implements Validable<ServiceCIDRStatus>, Exportable {
    private List<Condition> conditions;

    public ServiceCIDRStatus() {
        // no-op
    }

    public ServiceCIDRStatus(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceCIDRStatus)) {
            return false;
        }
        final ServiceCIDRStatus __otherCasted = (ServiceCIDRStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }

    public ServiceCIDRStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public ServiceCIDRStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
