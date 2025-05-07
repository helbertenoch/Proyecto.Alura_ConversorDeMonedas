package com.aluraprojecto.conversordemonedas.ClasePrincipal;

public record ValorDivisa(double tazaDeCambio,
        String codigoBase,
        String codigoTarget,
        String time_last_update_unix,
        String time_last_update_utc,
        String time_next_update_unix,
        String time_next_update_utc) {
}
