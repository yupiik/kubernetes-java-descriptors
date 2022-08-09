package io.yupiik.kubernetes.bindings.v1_8_8;

// internal class, public to share it accross subpackages but shouldn't be used by client code
public final class JsonStrings {
    private JsonStrings() {
        // no-op
    }

    public static String escapeJson(final String text) {
        if (text.isEmpty()) {
            return "";
        }

        final var out = new StringBuilder();

        final int length = text.length();
        for (int i = 0; i < length; i++) {
            int begin = i;
            int end = i;
            char c = text.charAt(i);
            while (c >= 0x20 && c != 0x22 && c != 0x5c) {
                i++;
                end = i;
                if (i < length) {
                    c = text.charAt(i);
                } else {
                    break;
                }
            }

            if (begin < end) { // no escaping
                out.append(text, begin, end);
                if (i == length) {
                    break;
                }
            }

            switch (c) {
                case '"', '\\' -> out.append('\\').append(c);
                case '\b' -> out.append('\\').append('b');
                case '\f' -> out.append('\\').append('f');
                case '\n' -> out.append('\\').append('n');
                case '\r' -> out.append('\\').append('r');
                case '\t' -> out.append('\\').append('t');
                default -> {
                    final var hex = "000" + Integer.toHexString(c);
                    out.append("\\u").append(hex.substring(hex.length() - 4));
                }
            }
        }

        return out.toString();
    }
}

