package io.yupiik.kubernetes.bindings.v1_17_0;

import java.util.Objects;

public class TokenRequestStatus {
    private String expirationTimestamp;
    private String token;

    public TokenRequestStatus() {
        // no-op
    }

    public TokenRequestStatus(final String expirationTimestamp,
                              final String token) {
        // no-op
    }

    public String getExpirationTimestamp() {
        return expirationTimestamp;
    }

    public void setExpirationTimestamp(final String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                expirationTimestamp,
                token);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenRequestStatus)) {
            return false;
        }
        final TokenRequestStatus __otherCasted = (TokenRequestStatus) __other;
        return Objects.equals(expirationTimestamp, __otherCasted.expirationTimestamp) &&
            Objects.equals(token, __otherCasted.token);
    }
}
