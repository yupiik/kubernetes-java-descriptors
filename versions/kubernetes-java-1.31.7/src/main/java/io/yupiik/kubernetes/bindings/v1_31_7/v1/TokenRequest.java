package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import io.yupiik.kubernetes.bindings.v1_31_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenRequest implements Validable<TokenRequest>, Exportable {
    private String audience;
    private Integer expirationSeconds;

    public TokenRequest() {
        // no-op
    }

    public TokenRequest(final String audience,
                        final Integer expirationSeconds) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(final String audience) {
        this.audience = audience;
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audience,
                expirationSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenRequest)) {
            return false;
        }
        final TokenRequest __otherCasted = (TokenRequest) __other;
        return Objects.equals(audience, __otherCasted.audience) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds);
    }

    public TokenRequest audience(final String audience) {
        this.audience = audience;
        return this;
    }

    public TokenRequest expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    @Override
    public TokenRequest validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (audience == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "audience", "audience",
                "Missing 'audience' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (audience != null ? "\"audience\":\"" +  JsonStrings.escapeJson(audience) + "\"" : ""),
                    (expirationSeconds != null ? "\"expirationSeconds\":" + expirationSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
