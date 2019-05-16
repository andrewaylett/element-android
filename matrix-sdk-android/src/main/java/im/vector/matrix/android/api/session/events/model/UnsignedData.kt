/*
 * Copyright 2019 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.matrix.android.api.session.events.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UnsignedData(
        @Json(name = "age") val age: Long?,
        @Json(name = "redacted_because") val redactedEvent: Event? = null,
        @Json(name = "transaction_id") val transactionId: String? = null,
        @Json(name = "prev_content") val prevContent: Map<String, Any>? = null,
        @Json(name = "m.relations") val relations: AggregatedRelations?
)