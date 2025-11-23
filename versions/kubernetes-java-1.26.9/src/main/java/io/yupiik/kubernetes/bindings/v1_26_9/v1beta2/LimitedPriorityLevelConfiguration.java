package io.yupiik.kubernetes.bindings.v1_26_9.v1beta2;

import io.yupiik.kubernetes.bindings.v1_26_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LimitedPriorityLevelConfiguration implements Validable<LimitedPriorityLevelConfiguration>, Exportable {
    private Integer assuredConcurrencyShares;
    private Integer borrowingLimitPercent;
    private Integer lendablePercent;
    private LimitResponse limitResponse;

    public LimitedPriorityLevelConfiguration() {
        // no-op
    }

    public LimitedPriorityLevelConfiguration(final Integer assuredConcurrencyShares,
                                             final Integer borrowingLimitPercent,
                                             final Integer lendablePercent,
                                             final LimitResponse limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.borrowingLimitPercent = borrowingLimitPercent;
        this.lendablePercent = lendablePercent;
        this.limitResponse = limitResponse;
    }

    public Integer getAssuredConcurrencyShares() {
        return assuredConcurrencyShares;
    }

    public void setAssuredConcurrencyShares(final Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
    }

    public Integer getBorrowingLimitPercent() {
        return borrowingLimitPercent;
    }

    public void setBorrowingLimitPercent(final Integer borrowingLimitPercent) {
        this.borrowingLimitPercent = borrowingLimitPercent;
    }

    public Integer getLendablePercent() {
        return lendablePercent;
    }

    public void setLendablePercent(final Integer lendablePercent) {
        this.lendablePercent = lendablePercent;
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
                borrowingLimitPercent,
                lendablePercent,
                limitResponse);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitedPriorityLevelConfiguration)) {
            return false;
        }
        final LimitedPriorityLevelConfiguration __otherCasted = (LimitedPriorityLevelConfiguration) __other;
        return Objects.equals(assuredConcurrencyShares, __otherCasted.assuredConcurrencyShares) &&
            Objects.equals(borrowingLimitPercent, __otherCasted.borrowingLimitPercent) &&
            Objects.equals(lendablePercent, __otherCasted.lendablePercent) &&
            Objects.equals(limitResponse, __otherCasted.limitResponse);
    }

    public LimitedPriorityLevelConfiguration assuredConcurrencyShares(final Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        return this;
    }

    public LimitedPriorityLevelConfiguration borrowingLimitPercent(final Integer borrowingLimitPercent) {
        this.borrowingLimitPercent = borrowingLimitPercent;
        return this;
    }

    public LimitedPriorityLevelConfiguration lendablePercent(final Integer lendablePercent) {
        this.lendablePercent = lendablePercent;
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
                    (borrowingLimitPercent != null ? "\"borrowingLimitPercent\":" + borrowingLimitPercent : ""),
                    (lendablePercent != null ? "\"lendablePercent\":" + lendablePercent : ""),
                    (limitResponse != null ? "\"limitResponse\":" + limitResponse.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
