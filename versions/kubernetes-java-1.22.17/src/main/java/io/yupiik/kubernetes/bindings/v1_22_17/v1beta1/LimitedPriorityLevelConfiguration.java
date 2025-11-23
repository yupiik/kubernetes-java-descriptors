package io.yupiik.kubernetes.bindings.v1_22_17.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_17.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_17.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LimitedPriorityLevelConfiguration implements Validable<LimitedPriorityLevelConfiguration>, Exportable {
    private Integer assuredConcurrencyShares;
    private LimitResponse limitResponse;

    public LimitedPriorityLevelConfiguration() {
        // no-op
    }

    public LimitedPriorityLevelConfiguration(final Integer assuredConcurrencyShares,
                                             final LimitResponse limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.limitResponse = limitResponse;
    }

    public Integer getAssuredConcurrencyShares() {
        return assuredConcurrencyShares;
    }

    public void setAssuredConcurrencyShares(final Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
    }

    public LimitResponse getLimitResponse() {
        return limitResponse;
    }

    public void setLimitResponse(final LimitResponse limitResponse) {
        this.limitResponse = limitResponse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assuredConcurrencyShares,
                limitResponse);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitedPriorityLevelConfiguration)) {
            return false;
        }
        final LimitedPriorityLevelConfiguration __otherCasted = (LimitedPriorityLevelConfiguration) __other;
        return Objects.equals(assuredConcurrencyShares, __otherCasted.assuredConcurrencyShares) &&
            Objects.equals(limitResponse, __otherCasted.limitResponse);
    }

    public LimitedPriorityLevelConfiguration assuredConcurrencyShares(final Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        return this;
    }

    public LimitedPriorityLevelConfiguration limitResponse(final LimitResponse limitResponse) {
        this.limitResponse = limitResponse;
        return this;
    }

    @Override
    public LimitedPriorityLevelConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (assuredConcurrencyShares != null ? "\"assuredConcurrencyShares\":" + assuredConcurrencyShares : ""),
                    (limitResponse != null ? "\"limitResponse\":" + limitResponse.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
