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
package io.yupiik.kubernetes.bindings.v1_30_10.v1beta3;

import io.yupiik.kubernetes.bindings.v1_30_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LimitedPriorityLevelConfiguration implements Validable<LimitedPriorityLevelConfiguration>, Exportable {
    private Integer borrowingLimitPercent;
    private Integer lendablePercent;
    private LimitResponse limitResponse;
    private Integer nominalConcurrencyShares;

    public LimitedPriorityLevelConfiguration() {
        // no-op
    }

    public LimitedPriorityLevelConfiguration(final Integer borrowingLimitPercent,
                                             final Integer lendablePercent,
                                             final LimitResponse limitResponse,
                                             final Integer nominalConcurrencyShares) {
        this.borrowingLimitPercent = borrowingLimitPercent;
        this.lendablePercent = lendablePercent;
        this.limitResponse = limitResponse;
        this.nominalConcurrencyShares = nominalConcurrencyShares;
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

    public Integer getNominalConcurrencyShares() {
        return nominalConcurrencyShares;
    }

    public void setNominalConcurrencyShares(final Integer nominalConcurrencyShares) {
        this.nominalConcurrencyShares = nominalConcurrencyShares;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                borrowingLimitPercent,
                lendablePercent,
                limitResponse,
                nominalConcurrencyShares);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitedPriorityLevelConfiguration)) {
            return false;
        }
        final LimitedPriorityLevelConfiguration __otherCasted = (LimitedPriorityLevelConfiguration) __other;
        return Objects.equals(borrowingLimitPercent, __otherCasted.borrowingLimitPercent) &&
            Objects.equals(lendablePercent, __otherCasted.lendablePercent) &&
            Objects.equals(limitResponse, __otherCasted.limitResponse) &&
            Objects.equals(nominalConcurrencyShares, __otherCasted.nominalConcurrencyShares);
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

    public LimitedPriorityLevelConfiguration nominalConcurrencyShares(final Integer nominalConcurrencyShares) {
        this.nominalConcurrencyShares = nominalConcurrencyShares;
        return this;
    }

    @Override
    public LimitedPriorityLevelConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (borrowingLimitPercent != null ? "\"borrowingLimitPercent\":" + borrowingLimitPercent : ""),
                    (lendablePercent != null ? "\"lendablePercent\":" + lendablePercent : ""),
                    (limitResponse != null ? "\"limitResponse\":" + limitResponse.asJson() : ""),
                    (nominalConcurrencyShares != null ? "\"nominalConcurrencyShares\":" + nominalConcurrencyShares : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
