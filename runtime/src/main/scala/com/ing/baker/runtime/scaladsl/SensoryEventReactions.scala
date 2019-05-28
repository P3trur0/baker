package com.ing.baker.runtime.scaladsl

import com.ing.baker.runtime.common
import com.ing.baker.runtime.common.LanguageDataStructures.ScalaApi
import com.ing.baker.runtime.common.SensoryEventStatus

import scala.concurrent.Future

case class SensoryEventReactions(
  received: Future[SensoryEventStatus],
  completed: Future[SensoryEventResult]
) extends common.SensoryEventReactions[Future] with ScalaApi {

  type Result = SensoryEventResult
}
