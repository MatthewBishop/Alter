package org.alter.game.message.handler

import net.rsprot.protocol.game.incoming.objs.OpObj6
import org.alter.game.message.MessageHandler
import org.alter.game.model.ExamineEntityType
import org.alter.game.model.World
import org.alter.game.model.entity.Client

class OpObj6Handler : MessageHandler<OpObj6> {

    override fun handle(client: Client, world: World, message: OpObj6) {
        world.sendExamine(client, message.id, ExamineEntityType.ITEM)
    }
}