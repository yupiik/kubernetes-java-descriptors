package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class PriorityLevelConfigurationListItemsSpecLimited {
    private Integer assuredConcurrencyShares;
    private PriorityLevelConfigurationListItemsSpecLimitedLimitResponse limitResponse;

    public PriorityLevelConfigurationListItemsSpecLimited() {
        // no-op
    }

    public PriorityLevelConfigurationListItemsSpecLimited(final Integer assuredConcurrencyShares,
                                                          final PriorityLevelConfigurationListItemsSpecLimitedLimitResponse limitResponse) {
        // no-op
    }

    public Integer getAssuredConcurrencyShares() {
        return assuredConcurrencyShares;
    }

    public void setAssuredConcurrencyShares(final Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
    }

    public PriorityLevelConfigurationListItemsSpecLimitedLimitResponse getLimitResponse() {
        return limitResponse;
    }

    public void setLimitResponse(final PriorityLevelConfigurationListItemsSpecLimitedLimitResponse limitResponse) {
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
        if (!(__other instanceof PriorityLevelConfigurationListItemsSpecLimited)) {
            return false;
        }
        final PriorityLevelConfigurationListItemsSpecLimited __otherCasted = (PriorityLevelConfigurationListItemsSpecLimited) __other;
        return Objects.equals(assuredConcurrencyShares, __otherCasted.assuredConcurrencyShares) &&
            Objects.equals(limitResponse, __otherCasted.limitResponse);
    }
}
