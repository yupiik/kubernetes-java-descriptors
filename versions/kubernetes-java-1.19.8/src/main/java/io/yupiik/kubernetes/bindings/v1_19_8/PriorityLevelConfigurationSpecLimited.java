package io.yupiik.kubernetes.bindings.v1_19_8;

import java.util.Objects;

public class PriorityLevelConfigurationSpecLimited {
    private Integer assuredConcurrencyShares;
    private PriorityLevelConfigurationSpecLimitedLimitResponse limitResponse;

    public PriorityLevelConfigurationSpecLimited() {
        // no-op
    }

    public PriorityLevelConfigurationSpecLimited(final Integer assuredConcurrencyShares,
                                                 final PriorityLevelConfigurationSpecLimitedLimitResponse limitResponse) {
        // no-op
    }

    public Integer getAssuredConcurrencyShares() {
        return assuredConcurrencyShares;
    }

    public void setAssuredConcurrencyShares(final Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
    }

    public PriorityLevelConfigurationSpecLimitedLimitResponse getLimitResponse() {
        return limitResponse;
    }

    public void setLimitResponse(final PriorityLevelConfigurationSpecLimitedLimitResponse limitResponse) {
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
        if (!(__other instanceof PriorityLevelConfigurationSpecLimited)) {
            return false;
        }
        final PriorityLevelConfigurationSpecLimited __otherCasted = (PriorityLevelConfigurationSpecLimited) __other;
        return Objects.equals(assuredConcurrencyShares, __otherCasted.assuredConcurrencyShares) &&
            Objects.equals(limitResponse, __otherCasted.limitResponse);
    }
}
