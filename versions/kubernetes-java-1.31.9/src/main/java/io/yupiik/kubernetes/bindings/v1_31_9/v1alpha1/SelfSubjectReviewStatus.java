package io.yupiik.kubernetes.bindings.v1_31_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_31_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelfSubjectReviewStatus implements Validable<SelfSubjectReviewStatus>, Exportable {
    private UserInfo userInfo;

    public SelfSubjectReviewStatus() {
        // no-op
    }

    public SelfSubjectReviewStatus(final UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(final UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                userInfo);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectReviewStatus)) {
            return false;
        }
        final SelfSubjectReviewStatus __otherCasted = (SelfSubjectReviewStatus) __other;
        return Objects.equals(userInfo, __otherCasted.userInfo);
    }

    public SelfSubjectReviewStatus userInfo(final UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    @Override
    public SelfSubjectReviewStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (userInfo != null ? "\"userInfo\":" + userInfo.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
