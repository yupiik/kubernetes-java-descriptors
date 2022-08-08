package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import io.yupiik.kubernetes.bindings.v1_17_0.Validable;
import io.yupiik.kubernetes.bindings.v1_17_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TokenRequestStatus implements Validable<TokenRequestStatus> {
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

    public TokenRequestStatus expirationTimestamp(final String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }

    public TokenRequestStatus token(final String token) {
        this.token = token;
        return this;
    }

    @Override
    public TokenRequestStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (expirationTimestamp == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "expirationTimestamp", "expirationTimestamp",
                "Missing 'expirationTimestamp' attribute.", true));
        }
        if (token == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "token", "token",
                "Missing 'token' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
