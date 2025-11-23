package io.yupiik.kubernetes.bindings.v1_30_13.v1beta3;

import io.yupiik.kubernetes.bindings.v1_30_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_13.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExemptPriorityLevelConfiguration implements Validable<ExemptPriorityLevelConfiguration>, Exportable {
    private Integer lendablePercent;
    private Integer nominalConcurrencyShares;

    public ExemptPriorityLevelConfiguration() {
        // no-op
    }

    public ExemptPriorityLevelConfiguration(final Integer lendablePercent,
                                            final Integer nominalConcurrencyShares) {
        this.lendablePercent = lendablePercent;
        this.nominalConcurrencyShares = nominalConcurrencyShares;
    }

    public Integer getLendablePercent() {
        return lendablePercent;
    }

    public void setLendablePercent(final Integer lendablePercent) {
        this.lendablePercent = lendablePercent;
    }

    public Integer getNominalConcurrencyShares() {
        return nominalConcurrencyShares;
    }

    public void setNominalConcurrencyShares(final Integer nominalConcurrencyShares) {
        this.nominalConcurrencyShares = nominalConcurrencyShares;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lendablePercent,
                nominalConcurrencyShares);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExemptPriorityLevelConfiguration)) {
            return false;
        }
        final ExemptPriorityLevelConfiguration __otherCasted = (ExemptPriorityLevelConfiguration) __other;
        return Objects.equals(lendablePercent, __otherCasted.lendablePercent) &&
            Objects.equals(nominalConcurrencyShares, __otherCasted.nominalConcurrencyShares);
    }

    public ExemptPriorityLevelConfiguration lendablePercent(final Integer lendablePercent) {
        this.lendablePercent = lendablePercent;
        return this;
    }

    public ExemptPriorityLevelConfiguration nominalConcurrencyShares(final Integer nominalConcurrencyShares) {
        this.nominalConcurrencyShares = nominalConcurrencyShares;
        return this;
    }

    @Override
    public ExemptPriorityLevelConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (lendablePercent != null ? "\"lendablePercent\":" + lendablePercent : ""),
                    (nominalConcurrencyShares != null ? "\"nominalConcurrencyShares\":" + nominalConcurrencyShares : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
