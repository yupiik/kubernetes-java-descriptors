package io.yupiik.kubernetes.bindings.v1_20_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_20_10.Validable;
import io.yupiik.kubernetes.bindings.v1_20_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LimitedPriorityLevelConfiguration implements Validable<LimitedPriorityLevelConfiguration> {
    private Integer assuredConcurrencyShares;
    private LimitResponse limitResponse;

    public LimitedPriorityLevelConfiguration() {
        // no-op
    }

    public LimitedPriorityLevelConfiguration(final Integer assuredConcurrencyShares,
                                             final LimitResponse limitResponse) {
        // no-op
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
}
