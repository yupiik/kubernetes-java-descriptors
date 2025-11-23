/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_30_6.v1beta3;

import io.yupiik.kubernetes.bindings.v1_30_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_6.Validable;
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
